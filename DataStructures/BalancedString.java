package Arraysprac.DataStructures;

    public class BalancedString {
        public static void main(String[] args) {
            String s = "[(){}]}";
            System.out.println(isBalanced(s));
        }
        public static boolean isBalanced(String s)
        {
            Stack stack=new Stack();
            char[]ch=s.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                char ch1=ch[i];
                if(ch1=='{'||ch1=='['||ch1=='(')stack.push(ch1);
                else if(ch1=='}'||ch1==']'||ch1==')')
                {
                    char ch2=(char)stack.pop();
                    if(!stack.isEmpty())return false;
                    if(!isPair(ch2, ch1))
                    {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }
        public static boolean isPair(char ch1, char ch2) {
            if (ch1 == '(' && ch2 == ')' || ch1 == '{' && ch2 == '}' || ch1 == '[' && ch2 == ']')
                return true;
            else
                return false;
        }
    }