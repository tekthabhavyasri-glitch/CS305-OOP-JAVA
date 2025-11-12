import java.awt.event.*;
import java.awt.*;
class LAB7P1{
	public static void main(String...args){
		final int[]a={1};
		Frame f=new Frame();
		FlowLayout fl=new FlowLayout();
		f.setLayout(fl);
		f.setSize(400,500);
		TextField tf=new TextField(30);
		Button b=new Button("Click");
		b.setSize(300,500);
		Label l=new Label();
		l.setPreferredSize(new Dimension(20,50));
		f.add(tf);
		f.add(l);
		f.add(b);
		f.setVisible(true);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				System.out.println("Hello");
				l.setText(tf.getText()+" "+a[0]);
				a[0]++;
			}
		});
		f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent we){
			f.dispose();
		}
		});
		}
}

