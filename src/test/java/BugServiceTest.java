import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BugServiceTest {

    private Bug bug = new Bug();

    @Test
    public void createBug() {
        Bug bug = new Bug();
        bug.setId(1);
        bug.setDescription("Important bug");
        bug.setUserId(1);
        Assert.assertEquals(bug.getId(), 1);
        Assert.assertNotEquals(bug.getDescription(), "Not very important bug");
    }

    @Before
    public void initTestBug(){
        bug.setId(666);
        bug.setDescription("Yet another bug");
        bug.setUserId(666);
    }

    @Test
    public void updateBug(){
        bug.setId(777);
        Assert.assertNotEquals(bug.getId(), 666);
    }

    @Test
    public void assignToUser() {
        bug.setUserId(555);
        Assert.assertEquals(bug.getUserId(), 555);
    }
}