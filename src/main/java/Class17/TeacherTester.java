package Class17;

public class TeacherTester {
    public static void main(String[] args) {
      PianoTeacher p=new PianoTeacher();
      p.teaching();
      p.lecturing();
      p.coaching();

      ChemistryTeacher c=new ChemistryTeacher();
      c.coaching();

      MathTeacher m=new MathTeacher();
      m.lecturing();
    }

}
