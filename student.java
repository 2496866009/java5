
public class student {
	 public String id;
	 public String name;
	 public String work;
	 public student(String id,String name,String work)
	 {
	  this.id = id;
	  this.name = name;
	  this.work = work;
	 }
	 public String toString() {
	  return "学号: "+this.id+"  姓名: "+this.name+" 作业:"+this.work;
	 }
}
