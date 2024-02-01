/**
 88
 Do not return anything, modify nums1 in-place instead.
 */
function merge(nums1, m, nums2, n) {
  const arr = [];

  for (let i = 0; i < m; ++i) {
    arr.push(nums1[i]);
  }

  for (let i = 0; i < n; ++i) {
    arr.push(nums2[i]);
  }

  arr.sort((a, b) => a - b);

  for (let i = 0; i < arr.length; ++i) {
    nums1[i] = arr[i];
  }
};

const nums1 = [-1, 0, 0, 3, 3, 3, 0, 0, 0];
const m = 6;
const nums2 = [1, 2, 2];
const n = 3;
merge(nums1, m, nums2, n);
