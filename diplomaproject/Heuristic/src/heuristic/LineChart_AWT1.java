package heuristic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT1 extends ApplicationFrame {

   public LineChart_AWT1( String applicationTitle , String chartTitle ) {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Duration Period","Toatl cost in Rupees",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( ) {
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      try{
      Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/heuristic","root","");
           Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/heuristic","root","");
           Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/heuristic","root","");
           Statement st=con.createStatement();
           Statement st1=con1.createStatement();
           Statement st2=con2.createStatement();
           ResultSet rs;
             ResultSet rs1;
             ResultSet rs2;
          
      rs=st.executeQuery("select * from result");
         while(rs.next()){
         double cost=Double.parseDouble(rs.getString("cost"));
         //JOptionPane.showMessageDialog(rootPane, cost);
      double perDay=Double.parseDouble(rs.getString("perDay"));
      dataset.addValue(Double.parseDouble(rs.getString("cost")) , "Conservative" , "1 Hr" );    
      dataset.addValue(Double.parseDouble(rs.getString("perDay")) ,"Conservative" ,  "1 Day" );
      dataset.addValue(Double.parseDouble(rs.getString("threeMonth")) , "Conservative" ,"3 Months" );
      dataset.addValue(Double.parseDouble(rs.getString("sixMonth")) , "Conservative" , "6 Months"  );
      dataset.addValue(Double.parseDouble(rs.getString("perYear")) , "Conservative" , "1 Year" );
      dataset.addValue(Double.parseDouble(rs.getString("threeYear")) , "Conservative" , "3 Years" );
     // return dataset;
         }
         
        /* rs1=st1.executeQuery("select * from result2");
         while(rs1.next()){        
      dataset.addValue(Double.parseDouble(rs1.getString("cost")) , "OnDemand" , "1 Hr" );    
      dataset.addValue(Double.parseDouble(rs1.getString("perDay")) ,"OnDemand" ,  "1 Day" );
      dataset.addValue(Double.parseDouble(rs1.getString("threeMonth")) , "OnDemand" , "3 Months" );
      dataset.addValue(Double.parseDouble(rs1.getString("sixMonth")) , "OnDemand" , "6 Months" );
      dataset.addValue(Double.parseDouble(rs1.getString("perYear")) , "OnDemand" , "1 Year" );
      dataset.addValue(Double.parseDouble(rs1.getString("threeYear")) , "OnDemand" , "3 Years" );
     // return dataset;
         }*/
         
       rs1=st1.executeQuery("select * from result2");
         while(rs1.next()){        
      dataset.addValue(Double.parseDouble(rs1.getString("cost")) , "Performance" , "1 Hr" );    
      dataset.addValue(Double.parseDouble(rs1.getString("perDay")) ,"Performance" ,  "1 Day" );
      dataset.addValue(Double.parseDouble(rs1.getString("threeMonth")) , "Performance" , "3 Months" );
      dataset.addValue(Double.parseDouble(rs1.getString("sixMonth")) , "Performance" , "6 Months" );
      dataset.addValue(Double.parseDouble(rs1.getString("perYear")) , "Performance" , "1 Year" );
      dataset.addValue(Double.parseDouble(rs1.getString("threeYear")) , "Performance" , "3 Years" );
     // return dataset;
         }
      }
      catch(Exception e)
      {
          System.out.print(e);
      }
        return dataset;
   }
   
   public static void main( String[ ] args ) {
      LineChart_AWT1 chart = new LineChart_AWT1(
         "Heuristic-Based Resource Reservation\n" +
"Strategies for Public Cloud" ,
         "Resource utilization Cost");

      chart.pack( );
      RefineryUtilities.centerFrameOnScreen( chart );
      chart.setVisible( true );
   }
}