import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public void addMembers(String[] names, int gradYears) {
        // We have to add MemberInfo objects to memberList
        for (int i = 0; i < names.length; i++) {
            MemberInfo NM = new MemberInfo(names[i], gradYears, true);
            memberList.add(NM);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> RS = new ArrayList<MemberInfo>();
        for(int i =0; i <= memberList.size(); i++){
            if(memberList.get(i).getGradYear() <= year){

            }
        }
    }

    public static void main(String[] args) {

    }
}
