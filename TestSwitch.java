public class TestSwitch{
	public static void main(String[] args) {
		char grade = 'D';
		switch(grade)
		{
		case 'A':
			System.out.println("优秀");
			break;
		case 'B':
			System.out.println("中等");
		case 'C':
		case 'D':
			System.out.println("及格");
		default:
			System.out.println("666");
		}
		System.out.println("等级是" + grade);
	}
}