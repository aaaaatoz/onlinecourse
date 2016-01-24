package algorithms.week1;

/**
 * Created by rafaxu on 24/01/2016.
 */
public class test {

    public static void main(String[] args){
        //test case for quickFind
        QuickFindUF myquickFindUF = new QuickFindUF(10);
        myquickFindUF.union(1,2);
        myquickFindUF.union(3,4);
        myquickFindUF.union(5,6);
        myquickFindUF.union(7,8);
        myquickFindUF.union(7,9);
        myquickFindUF.union(2,8);
        myquickFindUF.union(1,9);
        myquickFindUF.union(5,0);
        System.out.println(myquickFindUF.isConnected(2, 3));
        System.out.println(myquickFindUF.isConnected(4, 3));
        System.out.println(myquickFindUF.isConnected(5, 9));
        //test case for quickUnion
        QuickUnionUF myquickUnionUF = new QuickUnionUF(10);
        myquickUnionUF.union(1,2);
        myquickUnionUF.union(3,4);
        myquickUnionUF.union(5,6);
        myquickUnionUF.union(7,8);
        myquickUnionUF.union(7,9);
        myquickUnionUF.union(2,8);
        myquickUnionUF.union(1,9);
        myquickUnionUF.union(5,0);
        System.out.println(myquickUnionUF.isConnected(2, 3));
        System.out.println(myquickUnionUF.isConnected(4, 3));
        System.out.println(myquickUnionUF.isConnected(5, 9));
    }
}
