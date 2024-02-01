function solution(clothes) {
  const map = new Map();

  clothes.map((data) => {
    map.set(data[1], (map.get(data[1]) || 0) + 1);
  });

  let answer = 1;

  for (const key of map.keys()) {
    answer *= map.get(key) + 1;
  }
;
  console.log(answer - 1);
  return answer - 1;
}

solution([["yellow_hat", "headgear"], ["blue_sunglasses", "eyewear"], ["green_turban", "headgear"]]);
