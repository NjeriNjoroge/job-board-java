import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Job{
  private String mTitle;
  private String mDescription;
  private String mName;
  private int mTelephone;
  private static List<Job> instances = new ArrayList<Job>();

  public Job (String title, String description, String name, int telephone){
     mTitle = title;
     mDescription = description;
     mName = name;
     mTelephone = telephone;
     instances.add(this);
  }

public String getTitle(){
  return mTitle;
}

public String getDescription(){
  return mDescription;
}

public String getName(){
  return mName;
}

public int getTelephone(){
  return mTelephone;
}

public static List<Job> all() {
  return instances;
}


}
