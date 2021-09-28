package Tuan1;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements BaseService<Teacher,Integer>{
    private List<Teacher> list;

    public TeacherService() {
        list = new ArrayList<>();
    }

    @Override
    public boolean add(Teacher o) {
        if (this.get(o.getIdTeacher())==null){
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
    public boolean update(Teacher o, Integer id) {
        if (this.get(id)==null){
            return false;
        }
        for (Teacher teacher:this.list) {
            if (teacher.getIdTeacher()==id){
                teacher.setFistName(o.getFistName());
                teacher.setSex(o.getSex());
                teacher.setLastName(o.getLastName());
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Teacher> list() {
        return this.list;
    }

    @Override
    public Teacher get(Integer id) {
        for (Teacher teacher:this.list) {
            if (teacher.getIdTeacher()==id)
            	return teacher;
        }
        return null;
    }
    
   
}
