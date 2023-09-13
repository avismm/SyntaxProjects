package Class21Abstraction;

public abstract class T1File {
    private String name;
    private String fileType;
    private double fileSize;

    public T1File(String name,String fileType,double fileSize ){
        this.name=name;
        this.fileType=fileType;
        this.fileSize=fileSize;
    }
    public abstract void open();
    public void edit(){
        System.out.println("Editing a file");
    }
    public void close(){
        System.out.println("Closing a file");
    }
}
class javaFile extends T1File{

    //Default constructor in the child class that takes at least all fields in the constructor of the parent class.
    public javaFile(String name, String fileType, double fileSize) {

        //calling the constructor of the super class with the given arguments, to initialize the inherited members
        //of the superclass
        super(name, fileType, fileSize);
    }

    public void open(){
        System.out.println("To open Java file, we need a notepad ++");
    }
}
class wordFile extends T1File{

    //Default constructor in the child class that takes at least all fields in the constructor of the parent class.
    public wordFile(String name, String fileType, double fileSize) {

        //calling the constructor of the super class with the given arguments, to initialize the inherited members
        //of the superclass
        super(name, fileType, fileSize);
    }

    public void open(){
        System.out.println("To open word file, we need a MS word");
    }
}
class pdfFile extends T1File{

    //Default constructor in the child class that takes at least all fields in the constructor of the parent class.

    public pdfFile(String name, String fileType, double fileSize) {
        //calling the constructor of the super class with the given arguments, to initialize the inherited members
        //of the superclass
        super(name, fileType, fileSize);
    }

    public void open(){
        System.out.println("To open Java file, we need a pdf reader");
    }

}
