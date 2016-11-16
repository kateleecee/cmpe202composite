 

public interface Component {

     void printDescription() ;
     default void addChild(Component c){};
     default void removeChild(Component c){};
     default Component getChild(int i){return null;};

}
 
