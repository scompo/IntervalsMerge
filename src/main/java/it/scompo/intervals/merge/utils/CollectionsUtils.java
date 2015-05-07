package it.scompo.intervals.merge.utils;

import static it.scompo.intervals.merge.utils.NullChekUtils.notNullElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

public abstract class CollectionsUtils {

	private CollectionsUtils() {

	}

	public static <E> boolean onlyOneElement(Collection<E> temp) {

		return notNullElement(temp) && temp.size() == 1;
	}
	
	public static <T extends Serializable> List<T> deepCopyCollectionIntoList(
			Collection<T> toClone) {

		List<T> res = new ArrayList<T>();

		for (T t : toClone) {

			res.add(SerializationUtils.clone(t));
		}

		return res;
	}
}
