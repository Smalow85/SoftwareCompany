public class BugService {

    public Bug createBug(int id, String desc, int userId){
        Bug bug = new Bug();
        bug.setId(id);
        bug.setDescription(desc);
        bug.setUserId(userId);
        return bug;
    }

    public void updateBug(Bug bug, int id, String desc, int userId){
        bug.setId(id);
        bug.setDescription(desc);
        bug.setUserId(userId);
    }

    public void assignToUser(Bug bug, int userId){
        bug.setUserId(userId);
    }
}
