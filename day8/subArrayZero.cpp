#include<bits/stdc++.h>
using namespace std;
bool subArrayExists(int arr[], int n)
{
   map <int,bool> mp;
   int sum=0;
   for(int i=0;i<n;i++)
   {
       sum=sum+arr[i];
       if(sum==0 || mp.count(sum)==true)
        return true;
       else
        mp[sum]=true;
   }
   return false;
}
int main(){
    int n;
    cin>>n;
    int arr[n];
    int x=n;
    while(x--){
        cin>>arr[n-x-1];
    }
    if(subArrayExists){
        cout<<"True";
    }
    else{
        cout<<"False";
    }
}