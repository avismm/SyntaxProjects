package ReviewClass11;

import Utilities.ConfigReader;

public class E3Config {
    public static void main(String[] args) {
        //reading data from test.properties
        System.out.println(ConfigReader.getProperty("C:\\Users\\LENOVO\\IdeaProjects\\SyntaxProjects\\Files\\test.properties","browser"));
    }
}
