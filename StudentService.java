package Tuan1;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements BaseService<Student,Integer>{
    private List<Student> list;

    public StudentService() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(Student o) {
        if (this.get(o.getIdStudent())==null){
            this.list.add(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        if (this.get(id)==null){
            return false;
        }
        list.remove(this.get(id));
        return true;
    }

    @Override
    public boolean update(Student o, Integer id) {
        if (this.get(id)==null){
            return false;
        }
        for (Student student:this.list) {
            if (student.getIdStudent()==id){
                student.setFistName(o.getFistName());
                student.setSex(o.getSex());
                student.setLastName(o.getLastName());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Student> list() {
        return this.list;
    }

    @Override
    public Student get(Integer id) {
        for (Student student:this.list) {
            if (student.getIdStudent()==id)
            	return student;
        }
        return null;
    }


}
