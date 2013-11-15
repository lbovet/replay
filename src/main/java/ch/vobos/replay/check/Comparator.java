package ch.vobos.replay.check;

/**
 * @author Laurent Bovet (laurent.bovet@windmaster.ch)
 */
public interface Comparator<T /*extends HttpMessage*/> {

    Comparison<T> compare(T expected, T actual);

}
