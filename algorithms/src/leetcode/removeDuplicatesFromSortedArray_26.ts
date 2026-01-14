function removeDuplicates(nums: number[]): number {
  let answer = 1;
  let value = nums[0];

  for (let i = 1, index = 1; i < nums.length; i++) {
    if (value !== nums[i]) {
      value = nums[i];
      nums[index++] = value;
      answer++;
    }
  }

  return answer;
};

console.log(removeDuplicates([1,1,2]));
