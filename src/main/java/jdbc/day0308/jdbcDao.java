package jdbc.day0308;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class jdbcDao {
	JdbcTemplate jdbcTemplate;
	UserRowMapper mapper = new UserRowMapper();
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<User> selectAll(){
		String sql = "select*from member";
		List<User> member = jdbcTemplate.query(sql, mapper);
		return member;
	}
	
	public void insert() {
		String sql = "insert into member values('abc3', '123', '권우진3','이메일@이메일')";
		jdbcTemplate.update(sql);
	}
	

}
