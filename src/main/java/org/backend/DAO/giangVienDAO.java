package org.backend.DAO;

import java.util.List;
import org.backend.Entity.giangVien;
import org.springframework.stereotype.Repository;

public interface giangVienDAO {
	List<giangVien> getAll();
	boolean insert(giangVien gv);
	boolean update(String mgv, giangVien gv);
	boolean delete(String mgv);
	giangVien getById(String mgv);
	giangVien getByUsername(String username);
}
