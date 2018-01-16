/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jay.Ass2;


import java.util.*;

/**
 *
 * @author JAY PATEL
 */
public class ExTen {

public static void main(String args[])
{
   String[] states = {"California,", "Alabama,", "Arkansas,", "Arizona,", "Alaska,", "Colorado,", "Connecticut,", "Delaware,", "Florida,", "Georgia,", "Hawaii,", "Idaho,", "Illinois,", "Indiana,", "Iowa,", "Kansas,", "Kentucky,", "Louisiana,", "Maine,", "Maryland,", "Massachusetts,", "Michigan,", "Minnesota,", "Mississippi,", "Missouri,", "Montana,", "Nebraska,", "Nevada,", "New Hampshire,", "New Jersey,", "New Mexico,", "New York,", "North Carolina,", "North Dakota,", "Ohio,", "Oklahoma,", "Oregon,", "Pennsylvania,", "Rhode Island,", "South Carolina,", "South Dakota,", "Tennessee,", "Texas,", "Utah,", "Vermont,", "Virginia,", "Washington,", "West Virginia,", "Wisconsin,", "Wyoming" };
   Arrays.sort(states);
   for(String s:states)
   {
     //  System.out.print(s);
   }
    System.out.println("");
   
   //hashset
    HashSet<String> set= new HashSet<>(Arrays.asList(states));
    //System.out.println(set);
    
    //treeset
    TreeSet<String> tree=new TreeSet<>(set);
   // System.out.println(tree);
    
    //hashmap used integer instead of state code
    HashMap<Integer,String> hash=new HashMap<Integer,String>();
    for(int i=0;i<states.length;i++)
    {
        hash.put(i, states[i]);
    }
    System.out.println(hash);
    
    
    
}

}
