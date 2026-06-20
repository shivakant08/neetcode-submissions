class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        duplicate = set()
        for num in nums:
            duplicate.add(num)

        return len(duplicate) < len(nums)
        