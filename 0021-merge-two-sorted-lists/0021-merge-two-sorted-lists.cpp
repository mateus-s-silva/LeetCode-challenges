class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (!list1) return list2;
        else if (!list2) return list1;

        ListNode* mergedList = new ListNode(0);
        ListNode* current = mergedList;

        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val < list2->val) {
                current->next = list1;
                current = current->next;
                list1 = list1->next;
            } else {
                current->next = list2;
                current = current->next;
                list2 = list2->next;
            }
        }

        if (!list1) {
            current->next = list2;
        } else if (!list2) {
            current->next = list1;
        }

        ListNode* result = mergedList->next;
        delete mergedList;  // Libera o nó dummy

        return result;
    }
};