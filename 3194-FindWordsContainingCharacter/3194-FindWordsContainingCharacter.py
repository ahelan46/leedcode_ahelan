# Last updated: 8/11/2026, 3:58:35 PM
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        return [i for i, word in enumerate(words) if x in word]