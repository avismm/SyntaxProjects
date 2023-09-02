package Class10OOP;

public class PhoneTester {
    public static void main(String[] args) {

        //Creating the iphone object
        phone iphoneObj=new phone();

        iphoneObj.name="IPhone";
        iphoneObj.model= "iphone7";
        iphoneObj.type= "ED1";
        iphoneObj.storage=256;
        iphoneObj.size=17;

        // printing of the iphone attributes
        System.out.println(iphoneObj.name);
        System.out.println(iphoneObj.model);
        System.out.println(iphoneObj.type);
        System.out.println(iphoneObj.storage);
        System.out.println(iphoneObj.size);

        //Here we are calling the methods (calls,camera, messages)
        iphoneObj.calls();
        iphoneObj.camera();
        iphoneObj.messages();

        System.out.println();

        //Creating the pixel object
        phone pixelObj=new phone();

        pixelObj.name="Pixel";
        pixelObj.model= "Pixel 6";
        pixelObj.type= "FDE";
        pixelObj.storage=256;
        pixelObj.size=17;

        // printing of the pixel attributes
        System.out.println(pixelObj.name);
        System.out.println(pixelObj.model);
        System.out.println(pixelObj.type);
        System.out.println(pixelObj.storage);
        System.out.println(pixelObj.size);

        //Here we are calling the methods (calls,camera, messages)
        pixelObj.calls();
        pixelObj.camera();
        pixelObj.messages();
        System.out.println();

        //Creating the samsung object
        phone samsungObj=new phone();

        samsungObj.name="Samsung";
        samsungObj.model= "samsungG35";
        samsungObj.type= "FDE";
        samsungObj.storage=256;
        samsungObj.size=17;

        // printing of the samsung attributes
        System.out.println(samsungObj.name);
        System.out.println(samsungObj.model);
        System.out.println(samsungObj.type);
        System.out.println(samsungObj.storage);
        System.out.println(samsungObj.size);

        //Here we are calling the methods (calls,camera, messages)
        samsungObj.calls();
        samsungObj.camera();
        samsungObj.messages();


    }
}
