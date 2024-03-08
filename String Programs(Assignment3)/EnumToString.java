enum Course
{
	JAVA, ANDROID, HTML, CSS
}

public class EnumToString{

	public static void main(String[] args) {
		Course[] courses = Course.values();
		System.out.println("Name of All Courses");
		for(Course course: courses)
		{
			System.out.println(course.name());
	    }
	}
}
