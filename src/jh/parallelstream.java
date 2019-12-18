package jh;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class parallelstream {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("张三","李四","张小明","张阳");
		Stream<String> ps=list.parallelStream();
		if(ps.isParallel()) {
			System.out.println("只是一个并行流");
		}
			ps.limit(3).forEach(ys->System.out.println(ys));
		}

	}


