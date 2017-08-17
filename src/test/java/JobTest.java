import org.junit.*;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class JobTest {

  @Test
  public void newjob_instanceOf_true(){
    Job newJob = new Job("marketer", "be good", "leroy", 71012345);
    assertEquals(true, newJob instanceof Job);
  }

  @Test
  public void marketer_displayNewTitle_String(){
    Job newJob = new Job("marketer", "be good", "leroy", 71012345);
    assertEquals("marketer", newJob.getTitle());
  }

  @Test
  public void all_displaysAllInstances_true(){
    Job firstJob = new Job("marketer", "be good", "Ned Stark", 71012958);
    Job secondJob = new Job("poet", "be poetic", "Sansa", 71012398);
    assertEquals(true, Job.all().contains(firstJob));
    assertEquals(true, Job.all().contains(secondJob));
  }
}
