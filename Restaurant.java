/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author anup
 */
public class Restaurant extends JFrame implements ActionListener{
    JLabel j1,j2,j3,j4;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    static double cost = 0;
    double discount = 0.2;
    static double disc_cost = 0;
    double tax = 12.5/100;
    static double tax_amt = 0;
    static String dish_array[] = new String[10];
    static double final_cost = 1;
    ArrayList<String> dishes = new ArrayList<String>();
    //ArrayList<String> dishes1 = new ArrayList<String>(10);
    String dish;
    static int i = 0, j=0, item_number = 0, dessert_count;
    
    
public Restaurant()  
{
    setSize(1000,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLayout(null);
    setTitle("sunny restaurant");
  
    j1 = new JLabel("meal");
    j2 = new JLabel("desserts");
    j3 = new JLabel("Drinks");
    j4 = new JLabel("sunny restaurant");
    
    b1 = new JButton("fish and chips with peas");
    b2 = new JButton("vegetable curry and rice");
    b3 = new JButton("cheese and tomato pizza with salad");
    b4 = new JButton("meatball spagetty and tomato sauce");
    
    b5 = new JButton("fruit salad");
    b6 = new JButton("choclate cake");
    b7 = new JButton("ice cream");
    
    b8 = new JButton("water");
    b9 = new JButton("orange juice");
    b10 = new JButton("lemonade or cola");
    b11 = new JButton("milkshake banana or choclate");
    b12 = new JButton("total");
    
    
    j4.setBounds(530,30,400,30);
    j1.setBounds(80,100,200,30);
    j2.setBounds(80,200,200,30);
    j3.setBounds(80,300,200,30);
    
    b1.setBounds(290,100,300,30);
    b2.setBounds(600,100,300,30);
    b3.setBounds(290,140,300,30);
    b4.setBounds(600,140,300,30);
    
    b5.setBounds(290,200,300,30);
    b6.setBounds(600,200,300,30);
    b7.setBounds(290,240,300,30);
    
    b8.setBounds(290,300,300,30);
    b9.setBounds(600,300,300,30);
    b10.setBounds(290,340,300,30);
    b11.setBounds(600,340,300,30);
    b12.setBounds(500,380,200,50);
   
    add(j4);
    add(j1);
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    
    add(j2);
    add(b5);
    add(b6);
    add(b7);
    
    add(j3);
    add(b8);
    add(b9);
    add(b10);
    add(b11);
    add(b12);

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     b10.addActionListener(this);
     b11.addActionListener(this);
     b12.addActionListener(this);
 }

    public static void main(String[] args) {
        new Restaurant();
       
    }
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
    cost = cost + 60;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b2)
{
    cost = cost + 80;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b3)
{
    cost = cost + 99;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b4)
{
    cost = cost + 66;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b5)
{
    cost = cost + 39;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b6)
{
    cost = cost + 200;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b7)
{
    cost = cost + 250;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b8)
{
    cost = cost + 100;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b9)
{
    cost = cost + 105;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b10)
{
    cost = cost + 105;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b11)
{
    cost = cost + 210;
    dishes.add(e.getActionCommand());
}
if(e.getSource()==b12)
{
    for(j=0; j<dishes.size(); j++)
    {
        dish_array[j] = dishes.get(j);
    }
   
    item_number = dishes.size();
  
   for(i=0; i<dishes.size(); i++)
   {
     dish = dishes.get(i);
     if(dish == "ice cream")
     {
         dessert_count = dessert_count +1;
     }

   }
      if(dessert_count >= 2)
         {
         disc_cost = cost * discount; 
         cost = cost - disc_cost;
         JOptionPane.showMessageDialog(this, "congragulations you are eligible for 20 % discount");
         }
      tax_amt = cost * tax;
    final_cost = cost + tax_amt;
    new show_bill();
   }
    

}
}
class show_bill extends  JFrame implements ActionListener
{
JLabel items1, count_of_items, fin_cost, items2, count_of_items1, fin_cost1, orig_cost, applied_disc, applied_tax, orig_cost1, applied_disc1, applied_tax1 ;
JButton bb;
JList l1;
JScrollPane jsp;
public show_bill()
        {
            JList l1 = new JList(Restaurant.dish_array);
            JScrollPane jsp = new JScrollPane(l1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            
            
            items1 = new JLabel("list of items");
            count_of_items = new JLabel("total number of items");
            fin_cost = new JLabel("total final cost ");
            orig_cost = new JLabel("food cost");
            applied_disc = new JLabel("discount applicable");
            applied_tax = new JLabel("tax applicable");
            
            count_of_items1 = new JLabel(String.valueOf(Restaurant.item_number));
            fin_cost1 = new JLabel(String.valueOf("Rupees : "+Restaurant.final_cost));
            orig_cost1 = new JLabel(String.valueOf(Restaurant.cost));
            applied_disc1 = new JLabel(String.valueOf(Restaurant.disc_cost));
            applied_tax1 = new JLabel(String.valueOf(Restaurant.tax_amt));
            
            JButton  bb = new JButton("OK");
            
            setSize(700,700);
            setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Final invoice");
            setVisible(true);
            
            items1.setBounds(80,100,200,30);
            jsp.setBounds(290,100,150,150);
            
            count_of_items.setBounds(80,260,200,30);
            count_of_items1.setBounds(290,260,200,30);
            
            orig_cost.setBounds(80,300,200,30);
            orig_cost1.setBounds(290,300,200,30);
            
            applied_disc.setBounds(80,340,200,30);
            applied_disc1.setBounds(290, 340, 200,30);
            
            applied_tax.setBounds(80,380,200,30);
            applied_tax1.setBounds(290, 380, 200, 30);
            
            fin_cost.setBounds(80,420,200,30);
            fin_cost1.setBounds(290,420,200,30);
            
            bb.setBounds(280,460,150,30);
            
            add(items1);
            add(jsp);
            add(count_of_items);
            add(count_of_items1);
            add(fin_cost);
            add(fin_cost1);
            add(bb);
            add(applied_tax);
            add(applied_tax1);
            add(applied_disc);
            add(applied_disc1);
            add(orig_cost);
            add(orig_cost1);
           
            
            bb.addActionListener(this);
            
         }
public void actionPerformed(ActionEvent e1)
{
  if(e1.getActionCommand() == "OK")
        {
            JOptionPane.showMessageDialog(this, "visit again");
            System.exit(0);
        }
}

}
