function majorityElement(nums: number[]): number {

  if (nums.length === 1) {
    return nums[0];
  }

  nums.sort((a, b) => a - b);

  let answerCount = 0;
  let answer = 0;

  let count = 1;
  let num = nums[1];

  for (let i = 1; i < nums.length; i++) {
    const element = nums[i];

    if (element === num) {
      count++;
      num = element;
    } else {
      if (count > answerCount) {
        answerCount = count;
        answer = num;
      }

      count = 1;
      num = element;
    }
  }

  if (count > answerCount) {
    answerCount = count;
    answer = num;
  }

  return answer;
};

console.log(majorityElement([2,2,1,1,1,2,2]));
