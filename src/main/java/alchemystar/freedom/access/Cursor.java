package alchemystar.freedom.access;

import alchemystar.freedom.meta.Tuple;

/**
 * 扫描
 *
 * @Author lizhuyang
 */
public interface Cursor {

    Tuple getNext();
}
