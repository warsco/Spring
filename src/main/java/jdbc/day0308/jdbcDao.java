package jdbc.day0308;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class jdbcDao extends JdbcDaoSupport{
	UserRowMapper mapper = new UserRowMapper();
	/*JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/
	
	public List<User> selectAll(){
		String sql = "select*from member";
		List<User> member = getJdbcTemplate().query(sql, mapper);
		return member;
	}
	
	public void insert() {
		String sql = "insert into member values('abc3', '123', '권우진3','이메일@이메일')";
		getJdbcTemplate().update(sql);
	}
	

}
