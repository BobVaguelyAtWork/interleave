import spock.lang.Specification
import static Main.interleave

class InterleaveSpec extends Specification {
    def "simple use case for interleave"() {
        expect:
        interleave([1, 2, 3], [4, 5, 6]) == [1, 4, 2, 5, 3, 6]
    }
    
    def "no arguments should return an empty list"() {
        expect:
        interleave() == []
    }
    
    def "more than two lists isn't a problem"() {
        expect:
        interleave([1, 2], [3, 4], [5, 6, 7]) == [1, 3, 5, 2, 4, 6]
    }
    
    def "interleave only runs as long as all inputs have elements"() {
        expect:
        interleave([1, 2, 3], [4, 5]) == [1, 4, 2, 5]
    }
    
    def "any empty iterable should return an empty list"() {
        expect:
        interleave([1, 2, 3], [4, 5, 6], []) == []
    }
    
    def "collections can be interleaved"() {
        expect:
        interleave("hlo".collect(), "el!".collect()) == "hello!".collect()
    }
    
    def "nulls are preserved"() {
        expect:
        interleave([1, null, 3], [null, 5, 6]) == [1, null, null, 5, 3, 6]
    }
}