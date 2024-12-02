package icici.loans.refinements;

import java.io.File;
import java.util.Arrays;

public class ProjectDetails 
{
	public String className()
	{
		return this.getClass().getSimpleName();
	}
	
	public String packageName()
	{
		return this.getClass().getPackageName();
	}
	
	public String[] projectName(String projectPath)
	{
		File f = new File(projectPath);
		String name1 = f.getName();
		String name2 = f.getParent();
		return new String[] {name1,name2};
	}
	
	public String getLastNameFromPackage()
	{
		String p = this.getClass().getPackageName();
		String[] partName = p.split("\\.");
		System.out.println(partName.length);
		if(partName.length>=3)
			return partName[2];
		else
			return "String is not present at index";		
	}
	
	public static void main(String[] args) 
	{
		//D:\Naresh Batch-2\NareshIT5PMNovemberBatch
		String projectWorkingDirectory = System.getProperty("user.dir");
		System.out.println("Project Working Directory : " + projectWorkingDirectory);
		
		String userName = System.getProperty("user.name");
		System.out.println("Current User Name is : " + userName);
		
		String osName = System.getProperty("os.name");
		System.out.println("Os Name is :" + osName);
		
		String osversion = System.getProperty("os.version");
		System.out.println("Os version is :" + osversion);
		
		ProjectDetails obj = new ProjectDetails();
		
		String cName = obj.className();
		System.out.println("Class Name is : " + cName);
		
		String packName = obj.packageName();
		System.out.println("Package Name is : " +  packName);
		
		String[] projectName = obj.projectName(projectWorkingDirectory);
		//System.out.println("Project Name is : " + projectName);
		System.out.println("Project Name is : " + Arrays.toString(projectName));
		
		String lastNamePack = obj.getLastNameFromPackage();
		System.out.println("Last Name From Package is : " + lastNamePack);
	}
}
