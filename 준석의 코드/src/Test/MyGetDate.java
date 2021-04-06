package Test;

import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyGetDate {

	public void getTableData(JTable table){
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Vector vector= (Vector)model.getDataVector();
		for( Object obj :vector){
			String a = (String)(((Vector)obj).elementAt(0));
			System.out.println(a);
		}
	}
}
