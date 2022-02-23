public class override_super {

public static class Sports {
    String getName(){
        return "Generic Sports";
    }

    public void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " +
            getName() );
        }
    }

    public static class Soccer extends Sports {
        String getName(){
            return "Soccer Class";
        }
        public void getNumberOfTeamMembers(){
            System.out.println( "Each team has 11 players in " + getName() );
        }
    }
    public static void main(String[] args){
        Sports s=new Sports();
        Soccer S=new Soccer();
        System.out.println(s.getName());
        System.out.println( "Each team has n players in " + s.getName());
        System.out.println(S.getName());
        System.out.println( "Each team has 11 players in " + S.getName() );
    }
}