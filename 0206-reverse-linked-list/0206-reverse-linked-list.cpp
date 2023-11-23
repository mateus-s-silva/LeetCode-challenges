/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        
        //5(Current) -> NULLPTR(nextCurrent) 
        if(head == nullptr || head->next == nullptr) return head;
        
        
        ListNode* current = head;
        ListNode* nextCurrent = head->next;
        // 5 -> 4(newList) -> 3 -> 2 -> 1 -> nullptr
        ListNode* newList = nullptr;
        
        while(nextCurrent != nullptr){
            
            current->next = newList;
            newList = current;
            
            current = nextCurrent;
            nextCurrent = current->next;
            if(nextCurrent == nullptr){
                current->next = newList;
                newList = current;
            }
        }
        
        
        return newList;
    }
};