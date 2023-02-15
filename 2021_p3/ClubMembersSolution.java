import java.util.ArrayList;
import java.util.Collections;

public class ClubMembersSolution {
    private ArrayList<MemberInfo> memberList = new ArrayList<MemberInfo>();

    public void addMembers(String[] names, int gradYears) {
        for (String name : names) {
            MemberInfo newMember = new MemberInfo(name, gradYears, true);
            memberList.add(newMember);
        }
    }

    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> removedMembers = new ArrayList<MemberInfo>();
        for (int i = memberList.size(); i >= 0; i--) {
            MemberInfo member = memberList.get(i)
            if (member.getGradYear() <= year && member.inGoodStanding()){
                removedMembers.add(member);
            }
            memberList.remove(i);
        }
        return removedMembers;
    }

    public static void main(String[] args) {
        ClubMembersSolution cm = new ClubMembersSolution();
        String[] name1 = { "SMITH, JANE" };
        String[] name2 = { "FOX, STEVE" };
        String[] name3 = { "XIN, MICHAEL" };
        String[] name4 = { "GARCIA, MARIA" };
        cm.addMembers(name1, 2019);
        cm.addMembers(name2, 2018);
        cm.addMembers(name3, 2017);
        cm.addMembers(name4, 2020);
    }
}
