package Flowchart;

public class Quiz {
	
		public int fun (int  A, int B) {
			if( B == 0) {
				return A;
			}else {
				return fun( B, A %  B);
			}
		}
		public void main() {
			int ans = fun( 100, 2000);{
				
			}
			System.out.println(ans);
		}
		}



