#include<bits/stdc++.h>
using namespace std;
#define int long long
signed main()
 {
	fast
	int t,n;
	cin>>t;
	while(t--)
	{
	    string s;
	    cin>>s;
	    n=s.length();
  
        vector<int> alpha(26,0);
    	for(int i=0 ; i < s.length() ; i++)
    	alpha[ s[i] - 'a']++;
    	
    	priority_queue<pair<int,char>> pq;
    	
    	for(int i=0 ; i < 26 ; i++)
    	if( alpha[i] )
    	pq.push({ alpha[i] , i + 'a'});
    	
    	pair<int,char> prev={0,'@'};
    	s.clear();
    	
    	while(pq.size())
    	{
    		pair<int,char> curr=pq.top();
    		
    		pq.pop();
    		
    		s+=curr.second;
    		
    		curr.first--;
    		
    		if(prev.first)
    		pq.push(prev);
    		
    		prev=curr;
    	}
    	cout<<(s.length()==n)<<endl;
	}
	return 0;
}