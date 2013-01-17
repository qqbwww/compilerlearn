package linercompiler.exercises;


/******************************
 *   date: 2013-1-17 下午02:52:07
 * author: qb.qian
 *****************************************/
public class Tree {
    Tree left;
    String key;
    Object binding;
    Tree right;
    Tree(Tree l,String k,Tree r){
        left = l;
        key = k;
        right = r;
    }
    
    Tree insert(String key,Tree t){
        if(t==null)
            return new Tree(null,key,null);
        else if(key.compareTo(t.key) < 0)
            return new Tree(insert(key,t.left),t.key,t.right);
        else if(key.compareTo(t.key) > 0)
            return new Tree(t.left,t.key,insert(key,t.right));
        else 
            return new Tree(t.left,key,t.right);
    }
    
    /**
     * a
     */
    boolean isContain(String findkey){
        if(findkey.compareTo(key) == 0)
            return true;
        else if(findkey.compareTo(key) < 0)
            return left.isContain(findkey);
        else if(findkey.compareTo(key) > 0)
            return right.isContain(findkey);
        else
            return false;
    }
}
