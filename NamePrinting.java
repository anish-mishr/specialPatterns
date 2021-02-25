package specialPatterns;
import java.util.*;
/**
 * @author Anish
 *
 * 
 */

public class NamePrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(">> Enter Your Name to See Magic");
		String name = sc.nextLine();
		System.out.println("");
		
		for(int i = 0;i<name.length();i++){
			
			char c = Character.toUpperCase(name.charAt(i));
			if (c == 'A')
		        System.out.println("..######..\n..#....#..\n..######..\n..#....#..\n..#....#..\n\n");
		    else if (c == 'B')
		        System.out.println("..######..\n..#....#..\n..#####...\n..#....#..\n..######..\n\n");
		    else if (c == 'C')
		        System.out.println("..######..\n..#.......\n..#.......\n..#.......\n..######..\n\n");
		    else if (c == 'D')
		        System.out.println("..#####...\n..#....#..\n..#....#..\n..#....#..\n..#####...\n\n");
		    else if (c == 'E')
		        System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..######..\n\n");
		    else if (c == 'F')
		        System.out.println("..######..\n..#.......\n..#####...\n..#.......\n..#.......\n\n");
		    else if (c == 'G')
		        System.out.println("..######..\n..#.......\n..#####...\n..#....#..\n..#####...\n\n");
		    else if (c == 'H')
		        System.out.println("..#....#..\n..#....#..\n..######..\n..#....#..\n..#....#..\n\n");
		    else if (c == 'I')
		        System.out.println("..######..\n....##....\n....##....\n....##....\n..######..\n\n");
		    else if (c == 'J')
		        System.out.println("..######..\n....##....\n....##....\n..#.##....\n..####....\n\n");
		    else if (c == 'K')
		        System.out.println("..#...#...\n..#..#....\n..##......\n..#..#....\n..#...#...\n\n");
		    else if (c == 'L')
		        System.out.println("..#.......\n..#.......\n..#.......\n..#.......\n..######..\n\n");
		    else if (c == 'M')
		        System.out.println("..#....#..\n..##..##..\n..#.##.#..\n..#....#..\n..#....#..\n\n");
		    else if (c == 'N')
		        System.out.println("..#....#..\n..##...#..\n..#.#..#..\n..#..#.#..\n..#...##..\n\n");
		    else if (c == 'O')
		        System.out.println("..######..\n..#....#..\n..#....#..\n..#....#..\n..######..\n\n");
		    else if (c == 'P')
		        System.out.println("..######..\n..#....#..\n..######..\n..#.......\n..#.......\n\n");
		    else if (c == 'Q')
		        System.out.println("..######..\n..#....#..\n..#.#..#..\n..#..#.#..\n..######..\n\n");
		    else if (c == 'R')
		        System.out.println("..######..\n..#....#..\n..#.##...\n..#...#...\n..#....#..\n\n");
		    else if (c == 'S')
		        System.out.println("..######..\n..#.......\n..######..\n.......#..\n..######..\n\n");
		    else if (c == 'T')
		        System.out.println("..######..\n....##....\n....##....\n....##....\n....##....\n\n");
		    else if (c == 'U')
		        System.out.println("..#....#..\n..#....#..\n..#....#..\n..#....#..\n..######..\n\n");
		    else if (c == 'V')
		        System.out.println("..#....#..\n..#....#..\n..#....#..\n...#..#...\n....##....\n\n");
		    else if (c == 'W')
		        System.out.println("..#....#..\n..#....#..\n..#.##.#..\n..##..##..\n..#....#..\n\n");
		    else if (c == 'X')
		        System.out.println("..#....#..\n...#..#...\n....##....\n...#..#...\n..#....#..\n\n");
		    else if (c == 'Y')
		        System.out.println("..#....#..\n...#..#...\n....##....\n....##....\n....##....\n\n");
		    else if (c == 'Z')
		        System.out.println("..######..\n......#...\n.....#....\n....#.....\n..######..\n\n");
		    else if (c == ' ')
		        System.out.println("..........\n..........\n..........\n..........\n\n");
		    else if (c == '.')
		        System.out.println("----..----\n\n");
		}
		sc.close();
	}
}
