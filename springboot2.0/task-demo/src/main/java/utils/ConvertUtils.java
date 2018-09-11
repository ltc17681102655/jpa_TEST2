package utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: ivywooo
 * @date:2018/3/5
 **/
public class ConvertUtils {

    /**
     * .
     *
     * @param src
     * @param target
     * @return
     */
    public static void convert(Object src, Object target) {

        if (src == null) {
            target = null;
            return;
        }
        BeanUtils.copyProperties(src, target);
    }

    public static <T,S> List<T> convertList(List<S> source, Class<T> tClass) {
        if (source == null) {
            return null;
        }

        List<T> list = source.stream().map(e->{
            T target= null;
            try {
                target = tClass.newInstance();
                BeanUtils.copyProperties(e, target);
            } catch (InstantiationException |IllegalAccessException e1) {
                e1.printStackTrace();
            }
            return target;
        }).collect(Collectors.toList());

        return list;

    }

    public static void convertIgnoreNull(Object src, Object target){
        if (src == null) {
            target = null;
            return;
        }
        BeanUtils.copyProperties(src, target, getNullPropertyNames(src));
    }

    private static String[] getNullPropertyNames (Object source) {
        final BeanWrapper src = new BeanWrapperImpl(source);
        java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

        Set<String> emptyNames = new HashSet<String>();
        for(java.beans.PropertyDescriptor pd : pds) {
            Object srcValue = src.getPropertyValue(pd.getName());
            if (srcValue == null){
                emptyNames.add(pd.getName());
            }
        }
        String[] result = new String[emptyNames.size()];
        return emptyNames.toArray(result);
    }




}
