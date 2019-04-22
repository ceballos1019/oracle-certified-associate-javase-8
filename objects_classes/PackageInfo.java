package objects_classes;

/**
 * Shows the usage of the Package class
 * 
 * @author Andres Ceballos Sanchez - andresrxn10@hotmail.com
 * @version 1.0
 * @since 2019/04/18
 */
public class PackageInfo {

    

    public static void main(String[] args) {
        Package pack = Package.getPackage("java.lang");

        System.out.println("package name: " + pack.getName());
        System.out.println("Specification Title: " + pack.getSpecificationTitle());
        System.out.println("Specification Vendor: " + pack.getSpecificationVendor());
        System.out.println("Specification Version: " + pack.getSpecificationVersion());
        System.out.println("Implementaion Title: " + pack.getImplementationTitle());
        System.out.println("Implementation Vendor: " + pack.getImplementationVendor());
        System.out.println("Implementation Version: " + pack.getImplementationVersion());
        System.out.println("Is sealed: " + pack.isSealed());
    }

}