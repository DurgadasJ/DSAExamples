package sql;

public class Query {
    public static void main(String[] args) {

        String secMaxSalary  = "select salary from employee order by salary limit 1 offset 1";

        String deptWiseCount = "select dept from department where dept_id in " +
                               "(select dept_id from employee group by dept_id having count(*)>5)";

        String deleteDuplEmail = "delete p1 from person p1 " +
                                 "join person p2 on p1.email = p2.email" +
                                 "where p1.id > p2.id";

        String deleteDuplEmail_1 = "WITH CTE AS (select min(id) as keep_id from email_table group by email" +
                                   "delete from email_table where id not in (select keep_id from CTE)";

        String author_viewer = "select author_id as id from views where author_id = viewer_id " +
                               "group by author_id order by author_id";

        
    }
}
