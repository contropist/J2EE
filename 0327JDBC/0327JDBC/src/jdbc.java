import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
	public static void main(String[] args) {
		conn.link();
		//insert();
		//update();
		select();
	}

	public static void insert() {
		try {
			conn.st.executeUpdate("insert into username1 values('123','456')");
			System.out.println("���ݲ���ɹ���");
			System.out.println();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update() {
		try {
			conn.st.executeUpdate("update username1 set password='789' where id=2");
			System.out.println("���ݸ��³ɹ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void delete() {
		try {
			conn.st.executeUpdate("delete from username1 where id=2");
			System.out.println("����ɾ���ɹ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void select() {
		ResultSet rs=null;
		try {
			rs=conn.st.executeQuery("select * from username1");
			while(rs.next()){
				System.out.println(rs.getInt(1));
			}
			System.out.println("���ݲ�ѯ�ɹ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
