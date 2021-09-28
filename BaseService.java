package Tuan1;

import java.util.List;

public interface BaseService<T,K> {
	boolean add( T o);
	boolean delete(K id);
	boolean update(T o,K id);
	List<T> list();
	T get(K id);
}
