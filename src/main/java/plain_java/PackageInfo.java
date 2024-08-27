package sports;

//Class used to get the information about specific package
class PackageInfo
{
    public static void main(String[] args)
    {
        Package p = Package.getPackage("sports");
        System.out.println(p.getName());
    }
}