package Class21Abstraction;

public class FileTester {
    public static void main(String[] args) {
        T1File[] arr={new javaFile("alex","word",34.56), new pdfFile("pdf tester","pdf",65.89),new wordFile("word tester","word",54.11)};
        for(T1File f:arr){
            f.open();
            f.edit();
            f.close();
            System.out.println();
        }
    }
}
