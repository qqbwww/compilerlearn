package abstractgrammar.visitor;

import java.util.Vector;

/******************************
 *   date: 2013-1-24 下午05:17:06
 * author: qb.qian
 *****************************************/
public class ExpList {
    private Vector list;
    public ExpList(){
        list = new Vector();
    }
    
    public void addElement(Exp n){
        list.addElement(n);
    }
    
    public Exp elementAt(int i){
        return (Exp)list.elementAt(i);
    }
    public int size(){
        return list.size();
    }
}
